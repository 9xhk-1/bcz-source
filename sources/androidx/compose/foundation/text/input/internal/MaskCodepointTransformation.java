package androidx.compose.foundation.text.input.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class MaskCodepointTransformation implements CodepointTransformation {
    private final char character;

    public MaskCodepointTransformation(char c11) {
        this.character = c11;
    }

    public static /* synthetic */ MaskCodepointTransformation copy$default(MaskCodepointTransformation maskCodepointTransformation, char c11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c11 = maskCodepointTransformation.character;
        }
        return maskCodepointTransformation.copy(c11);
    }

    public final char component1() {
        return this.character;
    }

    @m80.k
    public final MaskCodepointTransformation copy(char c11) {
        return new MaskCodepointTransformation(c11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaskCodepointTransformation) && this.character == ((MaskCodepointTransformation) obj).character;
    }

    public final char getCharacter() {
        return this.character;
    }

    public int hashCode() {
        return Character.hashCode(this.character);
    }

    @m80.k
    public String toString() {
        return "MaskCodepointTransformation(character=" + this.character + ')';
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public int transform(int i11, int i12) {
        return this.character;
    }
}
