package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class CLContainer extends CLElement {
    ArrayList<CLElement> mElements;

    public CLContainer(char[] cArr) {
        super(cArr);
        this.mElements = new ArrayList<>();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLContainer(cArr);
    }

    public void add(CLElement cLElement) {
        this.mElements.add(cLElement);
        if (CLParser.sDebug) {
            System.out.println("added element " + cLElement + " to " + this);
        }
    }

    public void clear() {
        this.mElements.clear();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CLContainer) {
            return this.mElements.equals(((CLContainer) obj).mElements);
        }
        return false;
    }

    public CLElement get(String str) throws CLParsingException {
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) it.next();
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        throw new CLParsingException("no element for key <" + str + ">", this);
    }

    public CLArray getArray(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLArray) {
            return (CLArray) cLElement;
        }
        throw new CLParsingException("no array found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public CLArray getArrayOrCreate(String str) {
        CLArray arrayOrNull = getArrayOrNull(str);
        if (arrayOrNull != null) {
            return arrayOrNull;
        }
        CLArray cLArray = new CLArray(new char[0]);
        put(str, cLArray);
        return cLArray;
    }

    public CLArray getArrayOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLArray) {
            return (CLArray) orNull;
        }
        return null;
    }

    public boolean getBoolean(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLToken) {
            return ((CLToken) cLElement).getBoolean();
        }
        throw new CLParsingException("no boolean found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public float getFloat(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        throw new CLParsingException("no float found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public float getFloatOrNaN(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLNumber) {
            return orNull.getFloat();
        }
        return Float.NaN;
    }

    public int getInt(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        throw new CLParsingException("no int found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public CLObject getObject(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLObject) {
            return (CLObject) cLElement;
        }
        throw new CLParsingException("no object found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public CLObject getObjectOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLObject) {
            return (CLObject) orNull;
        }
        return null;
    }

    public CLElement getOrNull(String str) {
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) it.next();
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        return null;
    }

    public String getString(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLString) {
            return cLElement.content();
        }
        throw new CLParsingException("no string found for key <" + str + ">, found [" + (cLElement != null ? cLElement.getStrClass() : null) + "] : " + cLElement, this);
    }

    public String getStringOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLString) {
            return orNull.content();
        }
        return null;
    }

    public boolean has(String str) {
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement next = it.next();
            if ((next instanceof CLKey) && ((CLKey) next).content().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return Objects.hash(this.mElements, Integer.valueOf(super.hashCode()));
    }

    public ArrayList<String> names() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement next = it.next();
            if (next instanceof CLKey) {
                arrayList.add(((CLKey) next).content());
            }
        }
        return arrayList;
    }

    public void put(String str, CLElement cLElement) {
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) it.next();
            if (cLKey.content().equals(str)) {
                cLKey.set(cLElement);
                return;
            }
        }
        this.mElements.add((CLKey) CLKey.allocate(str, cLElement));
    }

    public void putNumber(String str, float f11) {
        put(str, new CLNumber(f11));
    }

    public void putString(String str, String str2) {
        CLString cLString = new CLString(str2.toCharArray());
        cLString.setStart(0L);
        cLString.setEnd(str2.length() - 1);
        put(str, cLString);
    }

    public void remove(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement next = it.next();
            if (((CLKey) next).content().equals(str)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.mElements.remove((CLElement) it2.next());
        }
    }

    public int size() {
        return this.mElements.size();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement next = it.next();
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(next);
        }
        return super.toString() + " = <" + ((Object) sb2) + " >";
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    @NonNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CLContainer mo5597clone() {
        CLContainer cLContainer = (CLContainer) super.mo5597clone();
        ArrayList<CLElement> arrayList = new ArrayList<>(this.mElements.size());
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement mo5597clone = it.next().mo5597clone();
            mo5597clone.setContainer(cLContainer);
            arrayList.add(mo5597clone);
        }
        cLContainer.mElements = arrayList;
        return cLContainer;
    }

    public String getStringOrNull(int i11) {
        CLElement orNull = getOrNull(i11);
        if (orNull instanceof CLString) {
            return orNull.content();
        }
        return null;
    }

    public float getFloat(int i11) throws CLParsingException {
        CLElement cLElement = get(i11);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        throw new CLParsingException("no float at index " + i11, this);
    }

    public int getInt(int i11) throws CLParsingException {
        CLElement cLElement = get(i11);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        throw new CLParsingException("no int at index " + i11, this);
    }

    public CLElement getOrNull(int i11) {
        if (i11 < 0 || i11 >= this.mElements.size()) {
            return null;
        }
        return this.mElements.get(i11);
    }

    public CLElement get(int i11) throws CLParsingException {
        if (i11 >= 0 && i11 < this.mElements.size()) {
            return this.mElements.get(i11);
        }
        throw new CLParsingException("no element at index " + i11, this);
    }

    public CLArray getArray(int i11) throws CLParsingException {
        CLElement cLElement = get(i11);
        if (cLElement instanceof CLArray) {
            return (CLArray) cLElement;
        }
        throw new CLParsingException("no array at index " + i11, this);
    }

    public boolean getBoolean(int i11) throws CLParsingException {
        CLElement cLElement = get(i11);
        if (cLElement instanceof CLToken) {
            return ((CLToken) cLElement).getBoolean();
        }
        throw new CLParsingException("no boolean at index " + i11, this);
    }

    public CLObject getObject(int i11) throws CLParsingException {
        CLElement cLElement = get(i11);
        if (cLElement instanceof CLObject) {
            return (CLObject) cLElement;
        }
        throw new CLParsingException("no object at index " + i11, this);
    }

    public String getString(int i11) throws CLParsingException {
        CLElement cLElement = get(i11);
        if (cLElement instanceof CLString) {
            return cLElement.content();
        }
        throw new CLParsingException("no string at index " + i11, this);
    }
}
