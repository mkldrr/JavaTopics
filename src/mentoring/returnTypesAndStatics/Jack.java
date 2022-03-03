package mentoring.returnTypesAndStatics;

public class Jack extends Mike {


    private String eyeColor;

    public static void main(String[] args) {
        Jack jack = new Jack();

        System.out.println(jack.getEyeColor());
    }


    @Override
    public String getEyeColor() {

        eyeColor = "Brawn";  // different implementation
        return eyeColor;
    }
}