/*
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.tests

import com.google.inject.Inject
import kcl.ac.uk.xtext.annotationsStores.AnnotationStores
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(AnnotationsStoresInjectorProvider)
class AnnotationsStoresParsingTest{

	@Inject
	ParseHelper<AnnotationStores> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
