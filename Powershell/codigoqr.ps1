"nombre,dni" > datos.csv
"juan,234234" >> datos.csv
"juan2,23444234" >> datos.csv
 
$datos = Import-Csv .\datos.csv
foreach($linea in $datos)
{
    $linea.nombre | wsl qrencode -o ($linea.dni+".jpg")
    # Instalar: sudo apt install imagemagick
    # Si da error
    # Solución: añadir
    # <policy domain="coder" rights="read | write" pattern="PDF" />
    # antes de </policymap> en /etc/ImageMagick-7/policy.xml
    wsl convert ($linea.dni+".jpg") ($linea.dni+".pdf")
}
 
# Juntar todos los ficheros pdf en uno
wsl convert *.pdf todo.pdf