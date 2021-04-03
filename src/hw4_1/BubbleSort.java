package hw4_1;
//***************************
//파일명: BubbleSort
//작성자: 유영무
//작성일: 21.04.01
//내용: 버블 정렬 알고리즘
//***************************

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("hw4_1 유영무");
		Scanner scanner = new Scanner(System.in);
		//배열 생성
		Student[] data = new Student[10];
		//data파일 잃어와서 배열에 저장
		try {
			Scanner iF = new Scanner(new File("C:/PJ/STS4/hw4_1/hw4_1.data"));
			int i = 0;
			while(iF.hasNext()) {
				int students = iF.nextInt();
				int score = iF.nextInt();
				data[i] = new Student(students, score);
				i++;
			}
			iF.close();
		}catch(FileNotFoundException e) {
			System.out.print("no file");
		}

		// 정렬 전 학생 배열 출력
		System.out.println("전체 학생 정보: ");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i].toString());
		}
		//버블정렬 실행
		bubbleSort(data);
		// 정렬 후 학생 배열 출력
		System.out.println("\n전체 학생 정보: ");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i].toString());
		}
		// 성적장학금 대상자 학번
		System.out.println("\n성적장학금 대상자: ");
		for (int i = 0; i <= 2; i++) {
			System.out.print(data[i].getStudents()+", ");
		}
		scanner.close();
	}

	private static void bubbleSort(Student[] data) {
		//버블정렬
		Student temp;
		for (int i = data.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j].getScore() < data[j + 1].getScore()) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}
}