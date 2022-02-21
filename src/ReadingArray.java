import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadingArray {

  public void CreateFileArray(){

    Scanner scanner = new Scanner(System.in);

    try{
      System.out.println("Informe o nome do sua pasta?");
      String cPasta = scanner.nextLine();
      
      System.out.println("Informe o nome do seu arquivo?");
      String cFile = scanner.nextLine();
  
      File dFile = new File("D:\\"+cPasta);
      dFile.mkdir();
  
     Path path = Path.of(dFile+"\\"+cFile+".txt");
     
     Files.createFile(path);
      
     String texto = "1,2,3,4,5";
     
     Files.writeString(path, texto);
  
      System.out.println("Local de origin do diretório criado : "+path);
      
    }catch(Exception e){
      System.out.println(e);
    }
    
  }

}