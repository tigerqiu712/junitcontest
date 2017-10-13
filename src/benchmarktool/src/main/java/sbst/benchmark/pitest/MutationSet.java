/**
  * Copyright (c) 2017 Universitat Politècnica de València (UPV)

  * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

  * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.

  * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.

  * 3. Neither the name of the UPV nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.

  * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
  **/
package sbst.benchmark.pitest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.pitest.mutationtest.engine.Mutant;
import org.pitest.mutationtest.engine.MutationDetails;
import org.pitest.mutationtest.engine.MutationIdentifier;

public class MutationSet {

	/** Map to keep track of the details of the generated mutations **/
	private Map<MutationIdentifier, MutationDetails> generatedMutantDetails;

	/** Map to keep track of the generated mutations **/
	private Map<MutationIdentifier, Mutant> generatedMutant;

	/**
	 * Simple constructor to initialize the data structure
	 */
	public MutationSet(){
		this.generatedMutantDetails = new HashMap<MutationIdentifier, MutationDetails>();
		this.generatedMutant = new HashMap<MutationIdentifier, Mutant>();
	}

	/**
	 * Add a new mutation to the set
	 * @param id of the mutation
	 * @param mu actual mutation to add
	 * @param detail details of the mutation
	 */
	public void addMutant(MutationIdentifier id, Mutant mu, MutationDetails detail){
		this.generatedMutant.put(id, mu);
		this.generatedMutantDetails.put(id, detail);
	}

	/**
	 * It returns the IDs of the mutations generated by PIT (the IDs are defined internally by PIT)
	 * @return Set of mutations ID
	 */
	public Set<MutationIdentifier> getMutationIDs(){
		return this.generatedMutant.keySet();
	}

	/**
	 * It retrieves the Mutation with the specified ID
	 * @param id of the mutation to retrieve
	 * @return retrieved mutation
	 */
	public Mutant getMutantion(MutationIdentifier id){
		return this.generatedMutant.get(id);
	}

	/**
	 * It retrieves the details of the Mutation with the specified ID
	 * @param id of the mutation to retrieve
	 * @return details of the retrieved mutation
	 */
	public MutationDetails getMutantionDetails(MutationIdentifier id){
		return this.generatedMutantDetails.get(id);
	}

	public int getNumberOfMutations(){
		return this.generatedMutant.keySet().size();
	}

	public void remove(MutationIdentifier id) {
		this.generatedMutant.remove(id);
		this.generatedMutantDetails.remove(id);
	}
}