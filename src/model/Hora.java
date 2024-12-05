package model;

public class Hora {
        private int hora;
        private String resumo;
        private boolean urgencia;
        private boolean concluido;


        public Hora(int hora, String resumo,boolean urgencia, boolean concluido) {
            this.hora = hora;
            this.resumo = resumo;
            this.urgencia = false;
            this.concluido = false;




        }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public boolean isUrgencia() {
        return urgencia;
    }

    public void setUrgencia(boolean urgencia) {
        this.urgencia = urgencia;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
    public String exibirTarefa() {
            return "Hora"+hora+ " | Descrição: "+resumo+" | Urgencia: "+(urgencia? "Sim":"Não")+" | Concluido: "+(concluido? "Sim":"Não");
    }

}

