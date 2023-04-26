import java.time.LocalDate;

public class App {
    public static void main(String[] args){
        Artigo a1 = new Artigo("Aula 03 de Java",
         new Autor("Dorgival", "Netto"),
          LocalDate.of(2023, 03, 20),
           Categoria.BACKEND);

        System.out.println(a1);
    }

}
