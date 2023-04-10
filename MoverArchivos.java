package TR;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoverArchivos {
    public static void main(String[] args) throws IOException {
        String rutaOrigen = "C:\\Users\\34622\\Desktop\\escan";
        String rutaEnero = "G:\\Mi unidad\\FACTURAS-TRIMESTRE\\2023-2024\\1T\\Enero";
        String rutaFebrero = "G:\\Mi unidad\\FACTURAS-TRIMESTRE\\2023-2024\\1T\\Febrero";
        String rutaMarzo = "G:\\Mi unidad\\FACTURAS-TRIMESTRE\\2023-2024\\1T\\Marzo";
	//Comentari nou 1
        File dirOrigen = new File(rutaOrigen);
        File[] archivos = dirOrigen.listFiles();

        for (File archivo : archivos) {
            if (archivo.isFile() && archivo.getName().endsWith("01.pdf")) {
                Path origenPath = Paths.get(archivo.getAbsolutePath());
                Path destinoPath = Paths.get(rutaEnero + "\\" + archivo.getName());
                Files.move(origenPath, destinoPath);
		//Comentari nou 2
            } else if (archivo.isFile() && archivo.getName().endsWith("02.pdf")) {
                Path origenPath = Paths.get(archivo.getAbsolutePath());
                Path destinoPath = Paths.get(rutaFebrero + "\\" + archivo.getName());
                Files.move(origenPath, destinoPath);

            } else if (archivo.isFile() && archivo.getName().endsWith("03.pdf")) {
                Path origenPath = Paths.get(archivo.getAbsolutePath());
                Path destinoPath = Paths.get(rutaMarzo + "\\" + archivo.getName());
                Files.move(origenPath, destinoPath);
            }
        }
    }
}
