/*
 * generated by Xtext 2.10.0
 */
package es.uam.sara.tfg.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class JRulesStandaloneSetup extends JRulesStandaloneSetupGenerated {

	def static void doSetup() {
		new JRulesStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
