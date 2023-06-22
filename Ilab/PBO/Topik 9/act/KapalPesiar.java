public class KapalPesiar extends Kapal
{
    private int maksPenumpang;

    public KapalPesiar(String nama, int tahunPembuatan, int maksPenumpang)
    {
        super(nama, 0);
        this.maksPenumpang = maksPenumpang;
    }

    public int getMaksPenumpang()
    {
        return maksPenumpang;
    }

    @Override
    public String toString()
    {
        return "Nama: " + getNama() + "\nMaks. Penumpang: " + maksPenumpang;
    }
}