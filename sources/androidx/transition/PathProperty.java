package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
class PathProperty<T> extends Property<T, Float> {
    private float mCurrentFraction;
    private final float mPathLength;
    private final PathMeasure mPathMeasure;
    private final PointF mPointF;
    private final float[] mPosition;
    private final Property<T, PointF> mProperty;

    public PathProperty(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.mPosition = new float[2];
        this.mPointF = new PointF();
        this.mProperty = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.mPathMeasure = pathMeasure;
        this.mPathLength = pathMeasure.getLength();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ Float get(Object obj) {
        return get((PathProperty<T>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(Object obj, Float f11) {
        set2((PathProperty<T>) obj, f11);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public Float get(T t11) {
        return Float.valueOf(this.mCurrentFraction);
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public void set2(T t11, Float f11) {
        this.mCurrentFraction = f11.floatValue();
        this.mPathMeasure.getPosTan(this.mPathLength * f11.floatValue(), this.mPosition, null);
        PointF pointF = this.mPointF;
        float[] fArr = this.mPosition;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.mProperty.set(t11, pointF);
    }
}
