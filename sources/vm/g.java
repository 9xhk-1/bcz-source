package vm;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g extends Property<ImageView, Matrix> {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f94069a;

    public g() {
        super(Matrix.class, "imageMatrixProperty");
        this.f94069a = new Matrix();
    }

    @Override // android.util.Property
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Matrix get(@NonNull ImageView imageView) {
        this.f94069a.set(imageView.getImageMatrix());
        return this.f94069a;
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@NonNull ImageView imageView, @NonNull Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
