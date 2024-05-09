package exercicios;

public class MetodosEx01 {
    /*
     * Vamos criar um exemplo de uma classe para representar uma SmartTV, onde:
     * 1. Ela tenha as características: ligada(boolean), canal(int), volume(int)
     * 2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
     * 3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
     * 4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número do canal
     */

    public static void main(String[] args) {
        SmartTv tvToshibinha = new SmartTv();

        tvToshibinha.setOn(true);

        System.out.println("TV Ligada? " + tvToshibinha.isOn());

        System.out.println("Volume Atual: " + tvToshibinha.getVolume());
        System.out.println("Canal Atual: " + tvToshibinha.getChannel());

        tvToshibinha.setVolumePlus1();
        tvToshibinha.setVolumePlus1();
        tvToshibinha.setVolumePlus1();
        tvToshibinha.setVolumePlus1();
        tvToshibinha.setVolumePlus1();

        System.out.println("Volume atual: " + tvToshibinha.getVolume());

        tvToshibinha.setChannel(15);
        System.out.println("Canal Atual: " + tvToshibinha.getChannel());

        tvToshibinha.setOn(false);

        System.out.println("TV Ligada? " + tvToshibinha.isOn());

    }

    private static class SmartTv {
        private static int DEFAULT_VOLUME = 15;
        private static int DEFAULT_CHANNEL = 1;

        private boolean on = false;
        private int volume = DEFAULT_VOLUME;
        private int channel = DEFAULT_CHANNEL;

        public void setVolumeToDefault() {
            this.volume = SmartTv.DEFAULT_VOLUME;
        }

        public void SetChannelToDefault() {
            this.channel = SmartTv.DEFAULT_CHANNEL;
        }

        // Getters
        public boolean isOn() {
            return this.on;
        }

        public int getVolume() {
            return this.volume;
        }

        public int getChannel() {
            return this.channel;
        }

        // Ligar e desligar TV
        public void setOn(boolean on) {
            this.on = on;
        }

        // Incrementar volume
        public void setVolumePlus1() {
            this.volume++;
        }

        // Decrementar volume
        public void setVolumeMinus1() {
            this.volume--;
        }

        // Incrementar canal
        public void setChannelPlus1() {
            this.channel++;
        }

        // Decrementar canal
        public void setChannelMinus1() {
            this.channel--;
        }

        // Definir canal
        public void setChannel(int newChannel) {
            this.channel = newChannel;
        }

    }

}
