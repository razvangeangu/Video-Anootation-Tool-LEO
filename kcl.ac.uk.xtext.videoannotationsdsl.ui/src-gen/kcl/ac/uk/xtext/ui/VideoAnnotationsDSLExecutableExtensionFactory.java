/*
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.ui;

import com.google.inject.Injector;
import kcl.ac.uk.xtext.videoannotationsdsl.ui.internal.VideoannotationsdslActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class VideoAnnotationsDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return VideoannotationsdslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return VideoannotationsdslActivator.getInstance().getInjector(VideoannotationsdslActivator.KCL_AC_UK_XTEXT_VIDEOANNOTATIONSDSL);
	}
	
}
