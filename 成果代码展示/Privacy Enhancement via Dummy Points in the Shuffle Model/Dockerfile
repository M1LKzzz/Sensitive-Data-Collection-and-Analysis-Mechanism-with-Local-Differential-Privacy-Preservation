# hash:sha256:f223737b6857be32b7c0da4343f5273dbc14d89ce65c1a7404bdb662700da0fa
FROM registry.codeocean.com/codeocean/miniconda3:4.12.0-python3.9-ubuntu20.04

ARG DEBIAN_FRONTEND=noninteractive

RUN conda install -y \
        jupyterlab==3.3.2 \
    && conda clean -ya

RUN pip3 install -U --no-cache-dir \
    numpy==1.26.3 \
    xxhash==3.4.1
