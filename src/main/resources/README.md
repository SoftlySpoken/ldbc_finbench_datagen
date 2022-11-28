# About Resources

Here we list the resources used in the Data Generation. There are three typical kinds of resourses here.
- Datasource: some raw data used as dictionaries to generate data, e.g. dummy names. 
- Distributions: distributions that describes the degree distribution.
- Parameters: the parameters that used to define some common configurations or limits in data generation process.

## Datasource

To avoid legal problems, we generate data using dummy names. The dummy names are generated by a free tool named FauxID[1] or copied from SNB.

- person names: person names generation is kinda complicated. So we refer to the SNB DataGen[2]
- company names: dummy names generated by fake-company-generator on Fauxid[3]

## Distributions

The distributions will be determined based on the real financial data profiling. Currently we use mock distribution from SNB[4] for developers to write code.

## Parameters

Here are some configuration and parameters used in data generation including,
- scale_factors.xml: a parameter map from the scale factors to the parameters that controls the data scale in generation.
- 


# Reference
[1] FauxID: https://fauxid.com
[2] SNB DataGen: https://github.com/ldbc/ldbc_snb_datagen_spark/blob/main/src/main/resources/dictionaries/surnameByCountryBirthPlace.txt.freq.sort
[3] fake-company-generator: https://fauxid.com/tools/fake-company-generator
[4] Mock distribution: https://github.com/ldbc/ldbc_snb_datagen_spark/blob/main/src/main/resources/dictionaries/facebookBucket100.dat