package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n1#2:373\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidCanvas_androidKt {

    @m80.k
    private static final android.graphics.Canvas EmptyCanvas = new android.graphics.Canvas();

    @m80.k
    public static final Canvas ActualCanvas(@m80.k ImageBitmap imageBitmap) {
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(new android.graphics.Canvas(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap)));
        return androidCanvas;
    }

    @m80.k
    public static final Canvas Canvas(@m80.k android.graphics.Canvas canvas) {
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(canvas);
        return androidCanvas;
    }

    @m80.k
    public static final android.graphics.Canvas getNativeCanvas(@m80.k Canvas canvas) {
        kotlin.jvm.internal.g0.n(canvas, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((AndroidCanvas) canvas).getInternalCanvas();
    }
}
