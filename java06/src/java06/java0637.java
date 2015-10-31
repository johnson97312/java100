package java06;

import java.util.Scanner;

public class java0637 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java0637 a = new java0637();
		Scanner scn = new Scanner(System.in);
		student johnson = a.new student("104001", "johnson");
		student leo = a.new student("104002", "leo");
		student jean = a.new student("104003", "jean");
		student james = a.new student("104004", "james");
		student jack = a.new student("104005", "jack");

		System.out.print("input johnson's Chinese Score: \t English Score: \t Math Score: \n");
		int chsc = scn.nextInt();
		int ensc = scn.nextInt();
		int masc = scn.nextInt();
		johnson.setchinesescore(chsc);
		johnson.setenglishscore(ensc);
		johnson.setmathscore(masc);
		System.out.print("Name: \t Chinese Score: \t  English Score: \t Math Score: \t Average:" + " \n johnson \t"
				+ johnson.getchsc() + "\t \t \t" + johnson.getensc() + "\t \t \t" + johnson.getmasc() + "\t \t "
				+ johnson.average(chsc, ensc, masc) + "\n");

		System.out.print("input leo's Chinese Score: \t English Score: \t Math Score: \n");
		chsc = scn.nextInt();
		ensc = scn.nextInt();
		masc = scn.nextInt();
		leo.setchinesescore(chsc);
		leo.setenglishscore(ensc);
		leo.setmathscore(masc);
		System.out.print("Name: \t Chinese Score: \t  English Score: \t Math Score: \t Average:" + " \n leo \t"
				+ leo.getchsc() + "\t \t \t" + leo.getensc() + "\t \t \t" + leo.getmasc() + "\t \t "
				+ leo.average(chsc, ensc, masc) + "\n");

		System.out.print("input jean's Chinese Score: \t English Score: \t Math Score: \n");
		chsc = scn.nextInt();
		ensc = scn.nextInt();
		masc = scn.nextInt();
		jean.setchinesescore(chsc);
		jean.setenglishscore(ensc);
		jean.setmathscore(masc);
		System.out.print("Name: \t Chinese Score: \t  English Score: \t Math Score: \t Average:" + " \n jean \t"
				+ jean.getchsc() + "\t \t \t" + jean.getensc() + "\t \t \t" + jean.getmasc() + "\t \t "
				+ jean.average(chsc, ensc, masc) + "\n");

		System.out.print("input james's Chinese Score: \t English Score: \t Math Score: \n");
		chsc = scn.nextInt();
		ensc = scn.nextInt();
		masc = scn.nextInt();
		james.setchinesescore(chsc);
		james.setenglishscore(ensc);
		james.setmathscore(masc);
		System.out.print("Name: \t Chinese Score: \t  English Score: \t Math Score: \t Average:" + " \n james \t"
				+ james.getchsc() + "\t \t \t" + james.getensc() + "\t \t \t" + james.getmasc() + "\t \t "
				+ james.average(chsc, ensc, masc) + "\n");

		System.out.print("input jack's Chinese Score: \t English Score: \t Math Score: \n");
		chsc = scn.nextInt();
		ensc = scn.nextInt();
		masc = scn.nextInt();
		jack.setchinesescore(chsc);
		jack.setenglishscore(ensc);
		jack.setmathscore(masc);
		System.out.print("Name: \t Chinese Score: \t  English Score: \t Math Score: \t Average:" + " \n jack \t"
				+ jack.getchsc() + "\t \t \t" + jack.getensc() + "\t \t \t" + jack.getmasc() + "\t \t "
				+ jack.average(chsc, ensc, masc) + "\n");
	}

	class student {
		private String id;
		private String name;
		private float chinese;
		private float english;
		private float math;

		public student(String id1, String name1) {
			id = id1;
			name = name1;
		}

		public void setchinesescore(float chsc) {
			chinese = chsc;
		}

		public void setenglishscore(float ensc) {
			english = ensc;
		}

		public void setmathscore(float masc) {
			math = masc;
		}

		public float getchsc() {
			return chinese;
		}

		public float getensc() {
			return english;
		}

		public float getmasc() {
			return math;
		}

		public float average(float v1, float v2, float v3) {
			float result = 0.0f;
			result = (v1 + v2 + v3) / 3f;
			return result;
		}
	}

}
