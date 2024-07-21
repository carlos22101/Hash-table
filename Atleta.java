public class Atleta {
        private String nombre;
        private String apellidoPaterno;
        private int edad;
        private String sexo;
        private String categoria;
    
        public Atleta() {}
    
        public Atleta(String nombre, String apellidoPaterno, int edad, String sexo, String categoria) {
            this.nombre = nombre;
            this.apellidoPaterno = apellidoPaterno;
            this.edad = edad;
            this.sexo = sexo;
            this.categoria = categoria;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getApellidoPaterno() {
            return apellidoPaterno;
        }
    
        public void setApellidoPaterno(String apellidoPaterno) {
            this.apellidoPaterno = apellidoPaterno;
        }
    
        public int getEdad() {
            return edad;
        }
    
        public void setEdad(int edad) {
            this.edad = edad;
        }
    
        public String getSexo() {
            return sexo;
        }
    
        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
    
        public String getCategoria() {
            return categoria;
        }
    
        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }
    
        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Apellido Paterno: " + apellidoPaterno + ", Edad: " + edad + ", Sexo: " + sexo + ", Categoría: " + categoria;
        }
    }
    
}
