TARGETS := awt/helloworldawt cli/helloworldcli

ifeq ($(shell uname -s),Darwin)
endif

JAVAC_FLAGS := -g
NI_FLAGS := -g -O0

all: $(TARGETS)

.PHONY: clean-targets

clean-targets:
	rm -rf *.dSYM/
	rm -f $(TARGETS)

clean: clean-targets

%.class: %.java
	javac $(JAVAC_FLAGS) $^

cli/helloworldcli: cli/HelloWorldCLI.class
	cd cli && native-image $(NI_FLAGS) HelloWorldCLI
