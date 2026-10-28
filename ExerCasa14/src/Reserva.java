public class Reserva {

    private int numero;
    private String nomeResponsavel;
    private String sala;
    private String data;
    private String horario;
    private String status;

    public Reserva(int numero, String nomeResponsavel) {
        this.numero = numero;
        this.nomeResponsavel = nomeResponsavel;
        status = "Agendada";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reserva " + numero + " - " + nomeResponsavel;
    }
}