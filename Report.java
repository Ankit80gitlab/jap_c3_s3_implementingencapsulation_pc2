public class Report {

    private int[] total;
    private String[] studentNames;



    public int[] getTotal() {
        return total;
    }

    public void setTotal(int[] total) {
        this.total = total;
    }

    public String[] getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(String[] studentNames) {
        this.studentNames = studentNames;
    }


    public String topScorer() {
        int big = 0;
        String top = null;

        for (int i = 0; i < total.length - 1; i++) {
            if (total[i] > big) {
                big = total[i];
                top = studentNames[i];
            }
        }
        return top;
    }

    public String[] passedStudents(int[] mathMarks, int scienceMarks[], int[] socialMarks, int[] languageMarks, int[] englishMarks) {

        String passFailStatus[] = new String[17];
        int k = 35;
        int j = 0;

        for (int i = 0; i < mathMarks.length; i++) {
            if (mathMarks[i] >= k) {
                if (scienceMarks[i] >= k) {
                    if (englishMarks[i] >= k) {
                        if (languageMarks[i] >= k) {
                            if (socialMarks[i] >= k) {
                                passFailStatus[j] = studentNames[i];
                                j++;
                            } else {

                            }
                        }
                    }
                }
            }
        }
        return passFailStatus;
    }

    public String[] failedStudents() {

        String[] failed = new String[2];
        int j = 0;

        for (int i = 0; i < total.length; i++) {
            if (total[i] < 175) {
                failed[j] = studentNames[i];
                j++;
            }
        }
        return failed;
    }
}
