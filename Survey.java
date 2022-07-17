public class Survey {

    private int[] rollNo;
    private int [] total;
    private int [] avgMarksOfEachStudent;


    public void setRollNo(int[] rollNo) {
        this.rollNo=rollNo;
    }
    public int [] getRollNo() {
        return rollNo;
    }

    public int[] getTotal() {
        return total;
    }

    public void setTotal(int[] total) {
        this.total = total;
    }

    public int[] getAvgMarksOfEachStudent() {
        return avgMarksOfEachStudent;
    }


    public void setAvgMarksOfEachStudent(int[] avgMarksOfEachStudent) {
        this.avgMarksOfEachStudent = avgMarksOfEachStudent;
    }

    public char [] generateGrades() {

        char [] grades=new char [total.length];

        for (int i=0; i<avgMarksOfEachStudent.length; i++)
        {
            if (avgMarksOfEachStudent[i] >=90)
            {
                grades[i]='A';
            }
            else if (avgMarksOfEachStudent[i] >=80 && avgMarksOfEachStudent[i]<90)
            {
                grades[i]='B';
            }
            else if (avgMarksOfEachStudent[i] >=70 && avgMarksOfEachStudent[i]<80)
            {
                grades[i]='C';
            }
            else if (avgMarksOfEachStudent[i] >=60 && avgMarksOfEachStudent[i]<69)
            {
                grades[i]='D';
            }
            else if (avgMarksOfEachStudent[i] >=50 && avgMarksOfEachStudent[i]<60)
            {
                grades[i]='E';
            }
            else
            {
                grades[i]='F';
            }
        }
        return grades;
    }


    public int[] rollNoByMarks()
    {

        int temp=0;
        int temp2=0;

        for (int i=0; i<total.length; i++)
        {
            for (int j=0; j< total.length-1; j++)
            {
                if (total[j]>total[j+1])
                {
                    temp=total[j];
                    total[j]=total[j+1];
                    total[j+1]=temp;

                    temp2=rollNo[j];
                    rollNo[j]=rollNo[j+1];
                    rollNo[j+1]=temp2;
                }
            }
        }
        return rollNo;
    }
}
