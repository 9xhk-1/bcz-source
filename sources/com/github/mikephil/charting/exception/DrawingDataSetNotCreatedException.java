package com.github.mikephil.charting.exception;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class DrawingDataSetNotCreatedException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public DrawingDataSetNotCreatedException() {
        super("Have to create a new drawing set first. Call ChartData's createNewDrawingDataSet() method");
    }
}
