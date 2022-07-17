public class OakBridge {
    public static void main(String [] args) {

        Evaluation obj1 =new Evaluation();
        Report obj2 =new Report();
        Survey obj3 =new Survey();

        String[] studentNames = new String[]{"Abe", "Gary", "Chloe", "Dave", "Fara", "Harry", "Ira", "Jack", "Jim", "Joel", "Kevin", "Larry", "Levin", "Malcolm", "Navya", "Nathan", "Noel", "Oliver", "Pamela", "Randall"};
        int[] rollNo = new int[]{101, 104, 102, 103, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120};
        int[] mathMarks = new int[]{95, 30, 55, 67, 88, 90, 45, 100, 95, 89, 66, 55, 35, 90, 22, 12, 67, 80, 75, 80};
        int[] scienceMarks = new int[]{95, 30, 55, 67, 83, 90, 54, 100, 95, 89, 66, 55, 35, 90, 22, 19, 67, 80, 75, 80};
        int[] englishMarks = new int[]{98, 45, 65, 67, 87, 96, 45, 98, 95, 89, 66, 55, 35, 90, 34, 18, 68, 81, 76, 81};
        int[] languageMarks = new int[]{95, 55, 76, 68, 89, 90, 44, 99, 95, 89, 66, 55, 35, 90, 44, 10, 69, 82, 77, 82};
        int[] socialMarks = new int[]{95, 88, 44, 70, 81, 93, 36, 99, 95, 89, 66, 55, 35, 90, 23, 20, 70, 83, 78, 80};

        //Evaluation inputs
        obj1.setMathMarks(mathMarks);
        obj1.setScienceMarks(scienceMarks);
        obj1.setEnglishMarks(englishMarks);
        obj1.setLanguageMarks(languageMarks);
        obj1.setSocialMarks(socialMarks);

        //Report inputs
        obj2.setTotal(obj1.totalMarksOfStudent());
        obj2.setStudentNames(studentNames);

        //Survey inputs
        obj3.setRollNo(rollNo);
        obj3.setTotal(obj1.totalMarksOfStudent());
        obj3.setAvgMarksOfEachStudent(obj1.averageMarksOfStudentEach(obj1.totalMarksOfStudent()));

        //Calling methods
        int [] A1=obj1.totalMarksOfStudent();
        String A=obj2.topScorer();
        String [] A2=obj2.passedStudents(mathMarks,scienceMarks,socialMarks,languageMarks,englishMarks);
        String [] A3=obj2.failedStudents();
        char [] A4=obj3.generateGrades();
        int [] A5=obj3.rollNoByMarks();

        //Printing output
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                          Report - Oak Bridge School                          ");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("(1) Total Marks of the Students are ");
        for (int i=0; i<A1.length; i++)
        {
            System.out.print(A1[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("(2) Top Scorer of the class is ");
        System.out.println(A);
        System.out.println();
        System.out.println("(3) Student who passed the exams are ");
        for (int i=0; i<A2.length; i++)
        {
            System.out.print(A2[i]+" ");
            if (i==12)
            {System.out.println();
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("(4) Student who failed in the exams are ");
        for (int i=0; i<A3.length; i++)
        {
            System.out.print(A3[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("(5) Grades of the students appeared in exam are ");
        for (int i=0; i<A4.length; i++)
        {
            System.out.print(A4[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("(6) Roll no. arranged as per marks obtained ");
        for (int i=0; i<A5.length; i++)
        {
            System.out.print(A5[i]+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                          Report - Oak Bridge School                          ");
        System.out.println("------------------------------------------------------------------------------");
    }
}
