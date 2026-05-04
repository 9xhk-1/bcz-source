package lb0;

import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c0 implements b0 {

    /* renamed from: x0, reason: collision with root package name */
    public static final b0 f70852x0 = new c0();

    public static Annotation[] a(Annotation[] annotationArr) {
        if (d0.l(annotationArr, b0.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f70852x0;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return b0.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof b0;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return EmailAutoCompleteEditText.f17091d + b0.class.getName() + "()";
    }
}
