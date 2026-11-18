package com.designpattern.builder;

class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private boolean graphicsCard;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU +
                ", RAM=" + RAM +
                ", Storage=" + storage +
                ", GraphicsCard=" + graphicsCard + "]";
    }

    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private boolean graphicsCard;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
