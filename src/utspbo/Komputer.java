package utspbo;

public class Komputer {
    public String memasang;
    public String mencabut;
    public String cetakinfo;
    
    public String getmemasang(){
        return memasang;
}
    public void setmemasang(){
        System.out.println("CPU = AMD 3 GHz di pasang");
        this.memasang = memasang;
}
    public String getmencabut(){
        return mencabut;
}
    public void setmencabut(){
        System.out.println("CPU =AMD3 GHz dicabut");
        this.mencabut = mencabut;
}
    public String getcetakinfo(){
        return cetakinfo;
}
    public void setcetakinfo(){
        System.out.println("Spesifikasi = CPU: Intel 2GHz");
        this.cetakinfo = cetakinfo;
}
    
}
