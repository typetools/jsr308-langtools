/*
 * @test /nodynamiccopyright/
 * @bug 6843077
 * @summary check for duplicate annotations
 * @author Mahmood Ali
 * @compile/fail/ref=DuplicateTypeAnnotation.out -XDrawDiagnostics DuplicateTypeAnnotation.java
 */
import java.lang.annotation.*;
class DuplicateTypeAnno<K extends @A @A Object> {
}

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface A { }
