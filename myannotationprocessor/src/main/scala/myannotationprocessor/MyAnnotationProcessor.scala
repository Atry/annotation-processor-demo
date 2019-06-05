package myannotationprocessor

import javax.annotation.processing._
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement

/**
  * @author 杨博 (Yang Bo)
  */
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@SupportedAnnotationTypes(Array("myannotationprocessor.MyAnnotation"))
class MyAnnotationProcessor extends AbstractProcessor {
  override def process(annotations: java.util.Set[_ <: TypeElement], roundEnv: RoundEnvironment): Boolean = {
    println("Hello, World!")
    false
  }
}
