package androidx.compose.ui.text.android;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.CharacterIterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CharSequenceCharacterIterator implements CharacterIterator {
    public static final int $stable = 8;

    @m80.k
    private final CharSequence charSequence;
    private final int end;
    private int index;
    private final int start;

    public CharSequenceCharacterIterator(@m80.k CharSequence charSequence, int i11, int i12) {
        this.charSequence = charSequence;
        this.start = i11;
        this.end = i12;
        this.index = i11;
    }

    @Override // java.text.CharacterIterator
    @m80.k
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i11 = this.index;
        return i11 == this.end ? kotlin.jvm.internal.q.f67020c : this.charSequence.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.index = this.start;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.start;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.end;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.index;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i11 = this.start;
        int i12 = this.end;
        if (i11 == i12) {
            this.index = i12;
            return kotlin.jvm.internal.q.f67020c;
        }
        int i13 = i12 - 1;
        this.index = i13;
        return this.charSequence.charAt(i13);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i11 = this.index + 1;
        this.index = i11;
        int i12 = this.end;
        if (i11 < i12) {
            return this.charSequence.charAt(i11);
        }
        this.index = i12;
        return kotlin.jvm.internal.q.f67020c;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i11 = this.index;
        if (i11 <= this.start) {
            return kotlin.jvm.internal.q.f67020c;
        }
        int i12 = i11 - 1;
        this.index = i12;
        return this.charSequence.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i11) {
        int i12 = this.start;
        if (i11 > this.end || i12 > i11) {
            throw new IllegalArgumentException("invalid position");
        }
        this.index = i11;
        return current();
    }
}
