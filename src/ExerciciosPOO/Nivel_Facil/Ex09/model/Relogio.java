package ExerciciosPOO.Nivel_Facil.Ex09.model;

public class Relogio {

    private Integer hora = 0;
    private Integer minuto = 0;
    private Integer segundo = 0;

    private Integer getHora() {
        return hora;
    }

    private void setHora(Integer hora) {
        this.hora = hora;
    }

    private Integer getSegundo() {
        return segundo;
    }

    private void setSegundo(Integer segundo) {
        this.segundo = segundo;
    }

    private Integer getMinuto() {
        return minuto;
    }

    private void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }

    public boolean acertarRelogio(int hora, int minuto, int segundo) {
        if(hora <0 || minuto < 0 || segundo < 0 || hora > 23 || minuto > 59 || segundo > 59){
            return false;
        }
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
        return true;
    }

    public void proximoSegundo(){
        if(getSegundo() == 59){
            setSegundo(0);
            proximoMinuto();
            return;
        }
        setSegundo(getSegundo() + 1);
    }

    public void proximoMinuto(){
        if(getMinuto() == 59){
            setMinuto(0);
            proximaHora();
            return;
        }
        setMinuto(getMinuto() + 1);
    }

    public void proximaHora(){

        if(getHora() == 23){
            setHora(0);
            setMinuto(0);
            setSegundo(0);
            return;
        }
        setHora(getHora() + 1);
    }

    public String horaAtual(){

        String hora = getHora() == 0 ? "00" : String.valueOf(getHora()) ;
        String minuto = getMinuto() == 0 ? "00" : String.valueOf(getMinuto());
        String segundo = getSegundo() == 0 ? "00" : String.valueOf(getSegundo());
        return  String.format("%s:%s:%s", hora, minuto, segundo);
    }

}
