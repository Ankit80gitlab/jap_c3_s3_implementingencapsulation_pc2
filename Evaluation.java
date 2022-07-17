public class Evaluation {

    private int [] mathMarks;
    private int [] scienceMarks;
    private int [] englishMarks;
    private int [] languageMarks;
    private int [] socialMarks;

    public int[] getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int[] mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int[] getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int[] scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public int[] getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int[] englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int[] getLanguageMarks() {
        return languageMarks;
    }

    public void setLanguageMarks(int[] languageMarks) {
        this.languageMarks = languageMarks;
    }

    public int[] getSocialMarks() {
        return socialMarks;
    }

    public void setSocialMarks(int[] socialMarks) {
        this.socialMarks = socialMarks;
    }



    public int[] totalMarksOfStudent() {


        int [] arrayTotal= new int [mathMarks.length];

        for (int i=0; i< arrayTotal.length; i++)
        {
            arrayTotal[i]=mathMarks[i]+scienceMarks[i]+englishMarks[i]+languageMarks[i]+socialMarks[i];
        }
        return arrayTotal;
    }


    public int totalClassAverage(int [] list) {

        int sum=0;

        for (int i=0; i< list.length; i++)
        {
            sum=sum+list[i];
        }
        return sum/ list.length;
    }


    public int[] averageMarksOfStudentEach(int []list) {

        int [] temp=new int[list.length];

        for (int i=0; i< list.length; i++)
        {
            temp[i] = list[i]/5;
        }
        return temp;
    }

}
