import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
double tutar, kdvoran=0.18;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ücret tutarını giriniz: ");
		tutar= input.nextDouble();
		
		if(0<tutar && tutar<=1000) {
			kdvoran=0.18;
		}
		else if(tutar>1000) {
			kdvoran=0.8;
		}
		
		double kdvTutar= tutar*kdvoran;
		double kdvliTutar= tutar+kdvTutar;
		System.out.println("KDV Oranı: "+kdvoran);
		System.out.println("KDV Tutarı: "+ kdvTutar);
		System.out.println("KDVLİ Tutar: "+kdvliTutar);

	}

}
