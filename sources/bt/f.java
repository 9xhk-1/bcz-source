package bt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f implements p<Number> {
    @Override // bt.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float evaluate(float f11, Number number, Number number2) {
        float floatValue = number.floatValue();
        return Float.valueOf(floatValue + (f11 * (number2.floatValue() - floatValue)));
    }
}
