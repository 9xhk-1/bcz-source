package tp;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.k;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface c {
    k[] b(com.google.zxing.b bVar) throws NotFoundException;

    k[] d(com.google.zxing.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException;
}
