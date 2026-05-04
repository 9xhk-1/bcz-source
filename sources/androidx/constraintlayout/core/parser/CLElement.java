package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.Objects;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class CLElement implements Cloneable {
    protected static int sBaseIndent = 2;
    protected static int sMaxLine = 80;
    protected CLContainer mContainer;
    private final char[] mContent;
    private int mLine;
    protected long mStart = -1;
    protected long mEnd = Long.MAX_VALUE;

    public CLElement(char[] cArr) {
        this.mContent = cArr;
    }

    public void addIndent(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(' ');
        }
    }

    public String content() {
        String str = new String(this.mContent);
        if (str.length() < 1) {
            return "";
        }
        long j11 = this.mEnd;
        if (j11 != Long.MAX_VALUE) {
            long j12 = this.mStart;
            if (j11 >= j12) {
                return str.substring((int) j12, ((int) j11) + 1);
            }
        }
        long j13 = this.mStart;
        return str.substring((int) j13, ((int) j13) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLElement)) {
            return false;
        }
        CLElement cLElement = (CLElement) obj;
        if (this.mStart == cLElement.mStart && this.mEnd == cLElement.mEnd && this.mLine == cLElement.mLine && Arrays.equals(this.mContent, cLElement.mContent)) {
            return Objects.equals(this.mContainer, cLElement.mContainer);
        }
        return false;
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    public String getDebugName() {
        if (!CLParser.sDebug) {
            return "";
        }
        return getStrClass() + " -> ";
    }

    public long getEnd() {
        return this.mEnd;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        return this.mLine;
    }

    public long getStart() {
        return this.mStart;
    }

    public String getStrClass() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public boolean hasContent() {
        char[] cArr = this.mContent;
        return cArr != null && cArr.length >= 1;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.mContent) * 31;
        long j11 = this.mStart;
        int i11 = (hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.mEnd;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        CLContainer cLContainer = this.mContainer;
        return ((i12 + (cLContainer != null ? cLContainer.hashCode() : 0)) * 31) + this.mLine;
    }

    public boolean isDone() {
        return this.mEnd != Long.MAX_VALUE;
    }

    public boolean isStarted() {
        return this.mStart > -1;
    }

    public boolean notStarted() {
        return this.mStart == -1;
    }

    public void setContainer(CLContainer cLContainer) {
        this.mContainer = cLContainer;
    }

    public void setEnd(long j11) {
        if (this.mEnd != Long.MAX_VALUE) {
            return;
        }
        this.mEnd = j11;
        if (CLParser.sDebug) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        CLContainer cLContainer = this.mContainer;
        if (cLContainer != null) {
            cLContainer.add(this);
        }
    }

    public void setLine(int i11) {
        this.mLine = i11;
    }

    public void setStart(long j11) {
        this.mStart = j11;
    }

    public String toFormattedJSON(int i11, int i12) {
        return "";
    }

    public String toJSON() {
        return "";
    }

    public String toString() {
        long j11 = this.mStart;
        long j12 = this.mEnd;
        if (j11 > j12 || j12 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.mStart + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.mEnd + j.f81007d;
        }
        return getStrClass() + " (" + this.mStart + " : " + this.mEnd + ") <<" + new String(this.mContent).substring((int) this.mStart, ((int) this.mEnd) + 1) + ">>";
    }

    @Override // 
    @NonNull
    /* renamed from: clone */
    public CLElement mo5597clone() {
        try {
            return (CLElement) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
