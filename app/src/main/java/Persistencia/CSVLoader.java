package Persistencia;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;


class CSVLoader {

    private static CSVLoader inst;

    public static CSVLoader getInstance() {
        if(CSVLoader.inst == null) inst = new CSVLoader();
        return inst;
    }

    private CSVLoader() {}

    public ArrayList<ArrayList<String>> carregarArxiu(InputStream file) throws IOException
    {
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

        Reader f = new InputStreamReader(file);

        char c;
        int n = -1;

        n = f.read();
        //read will return a -1 if it has encountered the end.
        //If this occurs at this point, it means that the file is empty
        c = (char)n;
        if (n == -1) {
            f.close();
            throw new IOException();
        }

        //-----Eliminació linies en blanc-----
        while (n != -1 && c == '\n') {
            n = f.read();
            c = (char)n;
        }
        //------------------------------------

        if (n == -1) {
            f.close();
            throw new IOException();
        }

        //Establir header de la taula: llegir totes les columnes
        int cols = 0;
        data.add(new ArrayList<String>());
        boolean finished_header = false;
        while (!finished_header)
        {
            String column_name = "";

            while (c != ',' && c != '\n')
            {
                if (c == '"')
                {
                    do
                    {
                        column_name += c;
                        n = f.read();
                        c = (char)n;
                    } while (c != '"');
                }

                column_name += c;
                n = f.read();
                c = (char)n;
            }

            ++cols;
            data.get(0).add(column_name);

            if (c == '\n' | n == -1) finished_header = true;

            if (n != -1)
            {
                n = f.read();
                c = (char)n;
            }
        }

        while (n != -1)
        {
            //-----Eliminació linies en blanc-----
            while (n != -1 && c == '\n') {
                n = f.read();
                c = (char)n;
            }
            //------------------------------------

            if (n != -1)
            {
                data.add(new ArrayList<String>());

                char END_CHAR = ',';
                char ANTI_END_CHAR = '\n';
                for (int i = 0; i < cols; ++i)
                {
                    if (i == cols-1)
                    {
                        END_CHAR = '\n';
                        ANTI_END_CHAR = ',';
                    }
                    String column_value = "";

                    while (n != -1 && c != END_CHAR)
                    {
                        if (c == ANTI_END_CHAR) {
                            f.close();
                            throw new IOException();
                        }
                        if (c == '"')
                        {
                            do
                            {
                                column_value += c;
                                n = f.read();
                                c = (char)n;
                            } while (c != '"');
                        }

                        column_value += c;
                        n = f.read();
                        c = (char)n;
                    }

                    data.get(data.size() - 1).add(column_value);

                    if (n == -1 && data.get(0).size() != data.get(data.size() - 1).size()) {
                        f.close();
                        throw new IOException();
                    }

                    if (n != -1)
                    {
                        n = f.read();
                        c = (char)n;
                    }
                }
            }
        }


        f.close();

        return data;
    }
}