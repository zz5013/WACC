#compile wacc, make executable and run it
echo "==============COMPILING WACC FILE============"
bash compile test.wacc
bash compile.sh
echo "===================RUNNING==================="
bash emulate.sh
