/**
 *   Copyright 2013 Wicked Forms (https://github.com/thombergs/wicked-forms)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.wickedsource.wickedforms.model.elements.fields;

import org.wickedsource.wickedforms.model.binding.Binding;

/**
 * A text field that may contain a string, a number or any other type that can
 * be represented as a string. A text field binds to a single object of type
 * String.
 * 
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 * 
 */
public class TextAreaModel extends AbstractInputFieldModel<String> {

	private String placeholder;

	/**
	 * @see AbstractInputFieldModel#InputField(String)
	 */
	public TextAreaModel(String label) {
		super(label);
	}

	/**
	 * @see AbstractInputFieldModel#InputField(String, Boolean)
	 */
	public TextAreaModel(String label, String value) {
		super(label, value);
	}

	public TextAreaModel() {
		super();
	}

	/**
	 * @see AbstractInputFieldModel#InputField(String, Binding)
	 */
	public TextAreaModel(String label, Binding<String> binding) {
		super(label, binding);
	}

	/**
	 * Sets the placeholder value that is initially displayed in the input field
	 * (if no value is set yet).
	 * 
	 * @param placeHolder
	 *            the placeholder to show initially.
	 */
	public void setPlaceHolder(String placeHolder) {
		this.placeholder = placeHolder;
	}

	public String getPlaceHolder() {
		return this.placeholder;
	}

	@Override
	public Class<?> getModelClass() {
		return String.class;
	}

}
