/*
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AnnotationsStoresStandaloneSetup extends AnnotationsStoresStandaloneSetupGenerated {

	def static void doSetup() {
		new AnnotationsStoresStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}