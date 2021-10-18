public class TV {
    public int channel;
    public int volume;
    public boolean on = false;

    public TV() {
        this.channel = 1;
        this.volume = 1;
        this.on = true;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void setChannel(int newChannel) throws Exception {
        if (newChannel > 120 || newChannel < 1) {
            throw new Exception("[!] You reached your limit! No channel available!");
        } else {
            this.channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (newVolumeLevel > 7) {
            this.volume = 7;
        } else if (newVolumeLevel < 1) {
            this.volume = 1;
        } else {
            this.volume = newVolumeLevel;
        }
    }

    public void channelUp() {
        if (this.channel == 120) {
            this.channel = 1;
        } else {
            this.channel++;
        }
    }

    public void channelDown() {
        if (this.channel == 1) {
            this.channel = 120;
        } else {
            this.channel--;
        }
    }

    public void volumeUp() {
        if (this.volume == 7) {
            this.volume = 7;
        } else {
            this.volume++;
        }
    }

    public void volumeDown() {
        if (this.volume == 1) {
            this.volume = 1;
        } else {
            this.volume--;
        }
    }
}
