package r90;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f extends v<Character> {
    public f() {
    }

    @Override // r90.v
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Character l(String str) {
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        DataProcessingException dataProcessingException = new DataProcessingException("'{value}' is not a character");
        dataProcessingException.setValue(str);
        throw dataProcessingException;
    }

    public f(Character ch2, String str) {
        super(ch2, str);
    }
}
