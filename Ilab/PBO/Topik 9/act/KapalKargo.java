public class KapalKargo extends Kapal
{
    private int kapasitasAngkut;

    public KapalKargo(String nama, int tahunPembuatan, int kapasitasAngkut)
    {
        super(nama, 0);
        this.kapasitasAngkut = kapasitasAngkut;
    }

    public int getKapasitasAngkut()
    {
        return kapasitasAngkut;
    }

    @Override
    public String toString()
    {
        return "Nama: " + getNama() + "\nKapasitas Angkut: " + kapasitasAngkut;
    }
}
