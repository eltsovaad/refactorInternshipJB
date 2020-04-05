Так как язык программирования и строение функции remane неизвестно, составим таблицу для тестирования черным ящиком

 Name of the test | Initial variable name | Refactored variable name | Notes
--- | --- | --- | ---
steamTest |          variableName             | anotherName
caseChangingFirst | variable | Variable
caseChangingSecond | Variable | variable  
caseChangingThird | VARIABLE | variable  
caseChangingFourth | variable | VARIABLE   
specSymsFirst | myVar | _var | A warning is expected  
specSymsSecond | myVar | MY_VAR  
specSymsThird | MY_VAR | myVar
notExistingVar | lkefajkenhaiofhdjvbkdb | var | error expected
veryLongVarName | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | a 
localVar | myVar | вводная
depricatedName | myVar | int | error expected

