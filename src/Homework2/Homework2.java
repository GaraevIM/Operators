package Homework2;

public class Homework2 {
    public static void main(String[] args) {

        int clientOS = 0;
        int clientDeviceYear = 2015;
        boolean light0 = clientOS == 0 && clientDeviceYear < 2015;
        if (light0) {
            System.out.println("���������� ����������� ������ ���������� ��� iOS");
        }
        boolean light1 = clientOS == 1 && clientDeviceYear < 2015;
        if (light1) {
            System.out.println("���������� ����������� ������ ���������� ��� Android");
        }
        boolean notLight0 = clientOS == 0 && clientDeviceYear >= 2015;
        if (notLight0) {
            System.out.println("���������� ������ ���������� ��� iOS");
        }
        boolean notLight1 = clientOS == 1 && clientDeviceYear >= 2015;
        if (notLight1) {
            System.out.println("���������� ����������� ������ ���������� ��� Android");
        }


        int year = 400;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " ��� �������� ����������");
        }
        else System.out.println(year + " ��� �� �������� ����������");


        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("����������� ����: 1");
        }
        boolean deliveryDistance2 = deliveryDistance > 20 && deliveryDistance <= 60;
        if (deliveryDistance2) {
            System.out.println("����������� ����: 2");
        }
        boolean deliveryDistance3 = deliveryDistance > 60 && deliveryDistance <= 100;
        if (deliveryDistance3) {
            System.out.println("����������� ����: 3");
        }
        boolean notDelivery = deliveryDistance > 100;
        if (notDelivery) {
            System.out.println("��������, �������� � ��� ����� �� ��������������");
        }



        int monthNumber = 5;
        switch (monthNumber){
            case 12, 1, 2 :
                System.out.println("��� ����, ����������");
                break;
            case 3, 4, 5 :
                System.out.println("��� �����, ����������");
                break;
            case 6, 7, 8 :
                System.out.println("��� ����, ����������");
                break;
            case 9, 10, 11 :
                System.out.println("��� �����, ����������");
            default:
                System.out.println("������ ������ �� ����������, ���������� ��� ���");
        }

    }
}
