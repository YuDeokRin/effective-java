package me.chapter01.item02.ExtendsBuilder;

public class Calzone extends Pizza{
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sacuceInside = false; // 기본값

        public Builder sauceInside(){
            sacuceInside = true;
            return this;
        }

        @Override
        public Calzone build(){
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sacuceInside;
    }
}
