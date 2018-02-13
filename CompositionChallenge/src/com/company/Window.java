package com.company;

public class Window {
    private Dimensions windowDimensions;
    private boolean isClosed;

    public Window(Dimensions windowDimensions, boolean isClosed) {
        this.windowDimensions = windowDimensions;
        this.isClosed = isClosed;
    }

    public void openWindow() {
        this.isClosed = false;
        System.out.println("Opening window");
    }

    public void closingWindow() {
        this.isClosed = false;
        System.out.println("Closing window");
    }

    private Dimensions getWindowDimensions() {
        return windowDimensions;
    }

    private boolean isClosed() {
        return isClosed;
    }
}
