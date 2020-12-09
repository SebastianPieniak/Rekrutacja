import services.Calculator;
import services.FileReader;
import services.NumberGenerator;
import services.RestService;



public class Main {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        NumberGenerator numberGenerator = new NumberGenerator();
        RestService restService = new RestService();

        Calculator calculator = new Calculator();

        calculator.calc("DODAWANIE",
                fileReader.getDataFromFile(),
                numberGenerator.generateNumber(),
                numberGenerator.generateNumber(),
                restService.getDataFromRest());

    }
}

