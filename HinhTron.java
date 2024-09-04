package VoNgocHuyenTran;

public class HinhTron {
   private double banKinh;
   private Tam t;
   
   
   public Tam getT() {
	return t;
}
public void setT(Tam t) throws Exception {
	if (t!=null) {
		this.t = t;
		
	} else {
		throw new Exception(" Loi ");
	}
	
}
// hang thuc
public static final double PI=3.1416;
public double getBanKinh() {
	return banKinh;
}
public void setBanKinh(double bK) throws Exception {
	if (bK>0) {
		this.banKinh = bK;
	} else {
		throw new Exception(" Loi ");
		}
	
}
// ham tao(constructor)
public HinhTron( ) {}
public HinhTron(double banKinh, Tam t) {
	
	this.banKinh = banKinh;
	this.t = t;
}
// dien tich va chu vi
public double getDienTich() {
	return getBanKinh()* getBanKinh()*PI;
}
public double getChuVi() {
	return getBanKinh()*2*PI;
}
// in mau
@Override
	public String toString() {
		String m="";
		m+=m.format("%3s, %10S, %10s", getBanKinh(), getDienTich(), getChuVi());
		return m;
	}
public static void main(String[] args) throws Exception {
	HinhTron h1 =new HinhTron(10, new Tam("O", 12, 22));
	System.out.println(h1);
	
}
   
}
