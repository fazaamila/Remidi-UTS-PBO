package utspbo;

public class CPU {
    public String nama;
    public String kecepatan;
    public String CPUdata;
    
    public String getCPUdata(){
        return CPUdata;
    }
    public void setCPUdata(){
        this.CPUdata = CPUdata;
        System.out.println("Intel 2 GHz");
    }
}
